//import './menu.css';

const Menu = () => {
    return (
        <>
            <div>
                <a className="nav-link active text-dark fs-6 fw-bold" aria-current="page" href="#">Home</a>
            </div>
            <div className="dropdown">
            <a className="nav-link dropdown-toggle text-dark fs-6 fw-bold" href="#" id="dropdown01" data-bs-toggle="dropdown" aria-expanded="false">Opções</a>
                <ul className="dropdown-menu" aria-labelledby="dropdown01">
                <li><a className="dropdown-item" href="#">Cadastro</a></li>
                <li><a className="dropdown-item" href="#">Another action</a></li>
                <li><a className="dropdown-item" href="#">Something else here</a></li>
                </ul>
            </div>
            <div>
                <a className="nav-link active text-dark fs-6 fw-bold" aria-current="page" href="#">Ajuda</a>
            </div>
        </>
    );
}

export default Menu;