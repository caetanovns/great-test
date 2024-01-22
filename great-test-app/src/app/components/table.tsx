"use client"
import { useEffect, useState } from "react";

export default function Table() {
    
    const [data, setData] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch('http://localhost:8080/inse?city=juazeiro do norte')
                const result = await response.json();
                setData(result);
            } catch (error) {
                console.log("Erro na requisição");
            }
        };
        fetchData();
    }, []);

    return (
        <table className="min-w-full bg-white border border-gray-300">
            <thead>
                <tr>
                    <th className="py-2 px-4 border-b">UF</th>
                    <th className="py-2 px-4 border-b">Cidade</th>
                    <th className="py-2 px-4 border-b">Escola</th>
                    <th className="py-2 px-4 border-b">INSE</th>
                    <th className="py-2 px-4 border-b">Classificação</th>
                </tr>
            </thead>
            <tbody>
                {data?.map((item, index) => (
                    <tr key={index}>
                        <td className="py-2 px-4 border-b text-center">{item['uf']}</td>
                        <td className="py-2 px-4 border-b text-center">{item['cityName']}</td>
                        <td className="py-2 px-4 border-b text-center">{item['schoolName']}</td>
                        <td className="py-2 px-4 border-b text-center">{item['inseAvg']}</td>
                        <td className="py-2 px-4 border-b text-center">{item['classificationInse']}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    );
}
