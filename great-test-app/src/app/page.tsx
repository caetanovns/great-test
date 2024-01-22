import Table from "./components/table";
import Summary from "./components/summary";
import Inputs from "./components/inputs";

export default function Home() {

  return (
    <main className="flex min-h-screen flex-col items-center justify-start p-24">
      <Inputs />
      <Summary />
      <Table />
    </main>
  );
}
