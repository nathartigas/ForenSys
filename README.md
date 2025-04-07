# ForenSys - Sistema de Gestão de Casos de Perícia Criminal

ForenSys é um sistema voltado à **simulação da gestão de casos periciais**, idealizado para fins acadêmicos, estudo técnico e desenvolvimento profissional. O objetivo é proporcionar uma plataforma intuitiva e robusta que permita o gerenciamento de ocorrências criminais, suspeitos, materiais coletados, laudos e perícias realizadas.

## Funcionalidades (planejadas e em desenvolvimento)

- [x] Cadastro de ocorrências
- [x] Cadastro de laudos
- [x] Cadastro de suspeitos
- [ ] Gestão de materiais coletados
- [ ] Registro de perícias realizadas
- [ ] Visualização de casos por status e data
- [ ] Sistema de autenticação e controle de acesso

## Tecnologias utilizadas

### Frontend
- React
- Vite
- TailwindCSS

### Backend
- Java (Spring Boot)
- H2 Database (temporário para testes)
- REST API (JSON)

### Banco de Dados
- Inicialmente: H2 (em memória)
- Futuramente: PostgreSQL ou MongoDB

## Estrutura de Pastas (em progresso)

forensys/
├── backend/
│   └── (projeto Spring Boot)
├── src/
│   └── forensys-frontend/
│       ├── public/
│       ├── src/
│       │   ├── assets/
│       │   ├── pages/
│       │   ├── App.jsx
│       │   └── index.css
│       ├── tailwind.config.js
│       └── vite.config.js
└── README.md

## Como rodar o projeto localmente

### 1. Clonar o repositório

```bash
git clone https://github.com/nathartigas/ForenSys.git
cd ForenSys
```

2. Backend (Spring Boot)
	1.	Abra o projeto backend em sua IDE Java (IntelliJ, VSCode com Extensão, etc.).
	2.	Certifique-se de que o banco de dados H2 esteja habilitado no application.properties.
	3.	Rode a aplicação (ForensysApplication.java).

3. Frontend (React + Vite)
  cd src/forensys-frontend
  npm install
  npm run dev

Abra o navegador em http://localhost:5173

Certifique-se de que o backend esteja rodando em outra porta (ex: 8080) para evitar conflitos.

Status do Projeto

Fase atual: Estruturação inicial de backend e frontend.
Próximos passos:
	•	Conectar frontend com a API Spring Boot
	•	Criar rotas de páginas e estrutura visual
	•	Implementar formulário de cadastro de ocorrências

Contribuição

Este projeto é desenvolvido como parte do plano de evolução técnica pessoal e acadêmica da autora. Contribuições, sugestões e ideias são bem-vindas!

Autora

Nathalia Artigas
Desenvolvedora Web em formação | Futura Perita Criminal Federal
