# ForenSys - Sistema de Gestão de Casos de Perícia Criminal

**ForenSys** é uma aplicação full stack desenvolvida para simular a gestão de casos periciais, com foco em fins educacionais e de experimentação. O sistema permite o cadastro, organização e visualização de ocorrências, laudos, suspeitos, perícias realizadas e materiais coletados.

---

## :hammer_and_wrench: Funcionalidades

- Cadastro e visualização de casos criminais
- Registro de suspeitos, laudos e perícias
- Gerenciamento de materiais coletados em cena
- Integração com banco de dados
- Interface moderna e responsiva com React e TailwindCSS

---

## :rocket: Tecnologias Utilizadas

### Frontend
- [React](https://reactjs.org/)
- [Vite](https://vitejs.dev/)
- [TailwindCSS](https://tailwindcss.com/)

### Backend
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Java](https://www.java.com/)
- [H2 Database (temporária)](https://www.h2database.com/)

### Outras Ferramentas
- PostCSS
- ESLint
- Git & GitHub

---

## :file_folder: Estrutura de Pastas

```
forensys/
│
├── src/
│   ├── forensys-backend/
│   │   └── ...código Java + Spring
│   ├── forensys-frontend/
│   │   ├── public/
│   │   ├── src/
│   │   │   ├── components/
│   │   │   ├── pages/
│   │   │   ├── App.jsx
│   │   │   └── index.css
│   │   └── package.json
```

---

## :computer: Como Executar o Projeto

### Backend (Spring Boot)
1. Abra o projeto no IntelliJ ou Eclipse.
2. Execute a classe `ForensysApplication.java`.
3. Acesse o banco via `http://localhost:8080/h2-console` com:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`
   - Password: *(em branco)*

### Frontend (React + Vite)
1. No terminal, acesse a pasta `forensys-frontend`.
2. Instale as dependências:
   ```bash
   npm install
   ```
3. Inicie o projeto:
   ```bash
   npm run dev
   ```

---

## :construction: Status do Projeto

- [x] Estrutura inicial backend e frontend criada
- [x] TailwindCSS configurado
- [ ] Cadastro de ocorrências
- [ ] CRUD completo para suspeitos, laudos e materiais
- [ ] Design responsivo e intuitivo
- [ ] Deploy final

---

## :handshake: Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch com sua feature: `git checkout -b minha-feature`
3. Commit suas mudanças: `git commit -m 'feat: minha feature'`
4. Push para a branch: `git push origin minha-feature`
5. Abra um Pull Request

---

## :scroll: Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Desenvolvido com dedicação por [Nathalia Artigas](https://github.com/nathartigas)

