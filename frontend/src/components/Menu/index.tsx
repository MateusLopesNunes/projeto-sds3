//import './menu.css';

import { Link } from "react-router-dom";

const Menu = () => {
    return (
        <>
            <div>
                <Link className="nav-link active text-dark fs-6 fw-bold" aria-current="page" to="#">Home</Link>
            </div>
            <div className="dropdown">
            <Link className="nav-link dropdown-toggle text-dark fs-6 fw-bold" to="#" id="dropdown01" data-bs-toggle="dropdown" aria-expanded="false">Opções</Link>
                <ul className="dropdown-menu" aria-labelledby="dropdown01">
                <li><Link className="dropdown-item" to="#">Cadastro</Link></li>
                <li><Link className="dropdown-item" to="#">Another action</Link></li>
                <li><Link className="dropdown-item" to="#">Something else here</Link></li>
                </ul>
            </div>
            <div>
                <Link className="nav-link active text-dark fs-6 fw-bold" aria-current="page" to="#">Ajuda</Link>
            </div>
        </>
    );
}

export default Menu;