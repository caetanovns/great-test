"use client"
import { useState } from "react";

export default function Inputs() {


    const [uf, setUf] = useState('');
    const [city, setCity] = useState('');
    const [school, setSchool] = useState('');

    return (
        <div className="flex space-x-4">
            <input
                type="text"
                className="border border-gray-300 p-2"
                placeholder="UF"
                onChange={(e) => { setUf(e.target.value) }}
            />
            <input
                type="text"
                className="border border-gray-300 p-2"
                placeholder="Município"
                onChange={(e) => { setCity(e.target.value) }}
            />
            <input
                type="text"
                className="border border-gray-300 p-2"
                placeholder="Escola"
                onChange={(e) => { setSchool(e.target.value) }}
            />
            <button
                type="button"
                className="bg-blue-500 text-white p-2 rounded"
            >
                Enviar
            </button>
        </div>
    );
}