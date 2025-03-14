# 🎯 Quiz App em JavaFX 🚀

Bem-vindo ao **Quiz App**! Este é um projeto simples desenvolvido em **JavaFX** para criar um quiz interativo. Ele utiliza uma interface gráfica moderna, com suporte a estilos CSS e arquivos FXML para a organização do código.

---

## 🎯 Funcionalidades

- **📝 Interface gráfica**: Desenvolvida com JavaFX e FXML.
- **🎨 Estilos CSS**: Design personalizado com arquivos CSS.
- **🕹️ Interatividade**: Controle de fluxo do quiz com Java.
- **🚀 Simplicidade**: Fácil de entender e expandir.

---

## 🛠️ Como Executar

### Pré-requisitos
- **Java JDK 11 ou superior**: [Baixar JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **JavaFX SDK**: [Baixar JavaFX SDK](https://gluonhq.com/products/javafx/)

### Passos para Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/quiz-javafx.git
   ```

2. **Navegue até a pasta do projeto**:
   ```bash
   cd quiz-javafx
   ```

3. **Configure o JavaFX**:
   - Adicione o JavaFX SDK ao classpath do seu projeto.
   - Se estiver usando uma IDE como IntelliJ ou Eclipse, configure o JavaFX nas configurações do projeto.

4. **Compile e execute**:
   - Via linha de comando (exemplo para Linux/Mac):
     ```bash
     javac --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/java/*.java
     java --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/java/Quiz
     ```
   - Em uma IDE, basta executar a classe `Quiz.java`.

5. **Pronto!** A interface gráfica do quiz será aberta.

---

## 🗂️ Estrutura do Projeto

Aqui está uma visão geral da estrutura do projeto:

```
quiz-javafx/
├── src/
│   ├── java/
│   │   ├── Quiz.java            # Classe principal que inicia a aplicação
│   │   └── HelloController.java # Controlador da interface gráfica
│   └── resources/
│       ├── hello-view.fxml      # Arquivo FXML da interface gráfica
│       └── styles.css          # Arquivo CSS para estilização
└── README.md                   # Este arquivo 
```

---

## 💻 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JavaFX**: Framework para criação de interfaces gráficas.
- **FXML**: Para definir a interface gráfica de forma declarativa.
- **CSS**: Para estilizar a interface gráfica.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Se quiser melhorar o projeto, siga os passos:

1. Faça um **fork** do projeto.
2. Crie uma branch com sua feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça commit das suas alterações:
   ```bash
   git commit -m 'Adicionando nova feature'
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **Pull Request** e aguarde a revisão.
