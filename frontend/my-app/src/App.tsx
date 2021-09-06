import NavBar from './components/NavBar/index';
import Footer from './components/Footer/index';
import DataTable from './components/DataTable/index';
import BarCharts from './components/BarCharts/index';
import DonutCharts from './components/DonutCharts/index';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <BarCharts/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <DonutCharts/>
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
        </div>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
