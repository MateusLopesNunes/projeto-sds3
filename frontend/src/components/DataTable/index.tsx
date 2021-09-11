import axios from "axios";
import { useEffect, useState } from "react";
import { formatLocalDate } from "../../utils/format";
import { SalePage } from "../../types/sale";
import { Base_URL } from "../../utils/requests";
import Pagination from "../../components/Pagination";

const DataTable = () => {

    const [activePages, setActivePages] = useState(0); 

    const [page, setPage] = useState<SalePage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        axios.get(`${Base_URL}/sales?page=${activePages}&size=15&sort=date,desc`).then(response => {
            setPage(response.data);
        });
    }, [activePages]);

    const changePage = (index: number) => {
        setActivePages(index);
    }

    return (
        <>
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Vendedor</th>
                            <th>Clientes visitados</th>
                            <th>Negócios fechados</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                                <td>{item.seller.name}</td>
                                <td>{item.visited}</td>
                                <td>{item.deals}</td>
                                <td>{item.amount.toFixed(2)}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
            <Pagination page={page} onPageChange={changePage}/>
        </>
    );
}

export default DataTable;