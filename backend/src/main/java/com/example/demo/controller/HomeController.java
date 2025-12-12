package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Welcome | Spring Boot Backend</title>
                    <style>
                        body {
                            margin: 0;
                            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                            background: linear-gradient(135deg, #56ab2f, #a8e063);
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            color: #fff;
                        }
                        .container {
                            text-align: center;
                            background: rgba(255, 255, 255, 0.1);
                            padding: 40px;
                            border-radius: 20px;
                            backdrop-filter: blur(12px);
                            box-shadow: 0 8px 25px rgba(0,0,0,0.25);
                            width: 70%;
                            max-width: 700px;
                        }
                        .container img {
                            width: 200px;
                            height: 200px;
                            border-radius: 15px;
                            object-fit: cover;
                            box-shadow: 0 4px 12px rgba(0,0,0,0.3);
                        }
                        h1 {
                            font-size: 42px;
                            margin: 20px 0 10px;
                        }
                        p {
                            font-size: 18px;
                            opacity: 0.9;
                        }
                        a {
                            margin-top: 20px;
                            display: inline-block;
                            padding: 12px 24px;
                            background-color: #ffffff;
                            color: #2e7d32;
                            font-weight: bold;
                            border-radius: 10px;
                            text-decoration: none;
                            transition: 0.3s;
                        }
                        a:hover {
                            background-color: #e8ffe3;
                            transform: translateY(-2px);
                        }
                    </style>
                </head>
                <body>

                    <div class="container">
                        <img src="https://media.istockphoto.com/id/1550071750/photo/green-tea-tree-leaves-camellia-sinensis-in-organic-farm-sunlight-fresh-young-tender-bud.jpg?s=612x612&w=0&k=20&c=RC_xD5DY5qPH_hpqeOY1g1pM6bJgGJSssWYjVIvvoLw=" 
                             alt="Tea Leaves Image">

                        <h1>🍃 Spring Boot Backend Running</h1>
                        <p>A clean and beautiful static webpage served by your backend.</p>
                        <p>Containerized • Docker • MySQL • Full Stack Ready 🚀</p>

                        <a href="/api/messages">View API Message</a>
                    </div>

                </body>
                </html>
                """;
    }
}

