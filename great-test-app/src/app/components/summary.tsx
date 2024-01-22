"use client"
import { useEffect, useState } from "react";

export default function Summary() {

    const [data, setData] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch('http://localhost:8080/inse/resume?city=juazeiro do norte')
                const result = await response.json();
                setData(result);
            } catch (error) {
                console.log("Erro na requisição");
            }
        };
        fetchData();

    }, []);
    
    return (
        <table className="min-w-full bg-white border border-gray-300 m-4">
            <thead>
                <tr>
                    <th className="py-2 px-4 border-b"></th>
                    <th className="py-2 px-4 border-b">INSE</th>
                    <th className="py-2 px-4 border-b">Estudantes</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td className="py-2 px-4 border-b text-center">Média</td>
                    <td className="py-2 px-4 border-b text-center">{data['inseAvg']}</td>
                    <td className="py-2 px-4 border-b text-center">{data['studentsAmount']}</td>
                </tr>
                <tr>
                    <td className="py-2 px-4 border-b text-center">Max.</td>
                    <td className="py-2 px-4 border-b text-center">{data['inseMax']}</td>
                    <td className="py-2 px-4 border-b text-center">{data['studentsMax']}</td>
                </tr>
                <tr>
                    <td className="py-2 px-4 border-b text-center">Min.</td>
                    <td className="py-2 px-4 border-b text-center">{data['inseMin']}</td>
                    <td className="py-2 px-4 border-b text-center">{data['studentsMin']}</td>
                </tr>
            </tbody>
        </table>
    );
}