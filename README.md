# 🏀 Overzscore 🏀

## Descrição do Projeto
O Overzscore é uma plataforma de SportsTech focada inicialmente na modalidade de basquete. Utilizando tecnologia de ponta, nosso objetivo é melhorar tanto a experiência quanto a prática desse esporte.

## Problemas e Oportunidades
 - 👉🏽 **Localização de Quadras**: Encontrar quadras de basquete disponíveis pode ser um desafio. Com o Overzscore, os usuários podem facilmente localizar e mapear quadras em todo o Brasil, eliminando a frustração de chegar a uma quadra e descobrir que está ocupada.
 - 👉🏽 **Organização de Partidas**: Agendar jogos pode ser complicado e demorado. Nossa plataforma oferece uma maneira simples e eficaz para os jogadores organizarem partidas em horários específicos, facilitando a coordenação entre os participantes.
 - 👉🏽 **Interação Social**: O basquete é mais do que apenas um jogo; é também sobre a comunidade. Com recursos como perfis de usuário, chat integrado e área para comentários, o Overzscore promove a interação entre os jogadores, construindo uma comunidade sólida em torno do esporte.
 - 👉🏽 **Experiência do Usuário Aprimorada**: Nosso foco principal é proporcionar uma experiência fluida e agradável para os jogadores. Ao simplificar a busca por quadras, agendar partidas e promover a interação social, o Overzscore torna a prática do basquete mais acessível e envolvente para todos os apaixonados pelo esporte.

## Futuras Expansões
Em breve, também planejamos expandir nossa plataforma para incluir a modalidade de futebol, com um foco particular na área de society. Estamos animados para explorar novas oportunidades de melhorar a experiência dos jogadores e promover a interação social nessa modalidade esportiva.

![logopng](https://github.com/ThiagoAlv1/overzscore/assets/101125484/5668b6b6-13f4-40ad-89a5-14f9b61ec68a) ![overzcore logo](https://github.com/ThiagoAlv1/overzscore/assets/101125484/5a7f9b00-21a6-4e3e-8ff9-fa41e4eda986)


## Como Contribuir
Se você é um entusiasta do basquete ou um desenvolvedor de tecnologia interessado em contribuir para nossa plataforma, fique à vontade para explorar nosso código-fonte, enviar pull requests e compartilhar suas ideias conosco. Juntos, podemos tornar a experiência no basquete ainda melhor!

### Tutorial de Contribuição
1. **Faça um Fork do Repositório**: Clique no botão "Fork" no canto superior direito da [página do repositório](https://github.com/ThiagoAlv1/overzscore) para criar uma cópia do projeto na sua própria conta do GitHub.
2. **Clone o Repositório Forked**: Copie o link do seu fork e execute `git clone https://github.com/ThiagoAlv1/overzscore` no seu terminal para clonar o repositório para o seu ambiente local.
3. **Crie uma Branch para suas Alterações**: Utilize `git checkout -b minha-alteracao` para criar uma nova branch onde você fará suas alterações.
4. **Faça suas Alterações**: Realize as modificações necessárias no código.
5. **Commit e Push das Alterações**: Adicione e comite as alterações (`git add .` e `git commit -m "Descrição concisa das alterações"`), então envie as mudanças para o seu fork (`git push origin minha-alteracao`).
6. **Envie um Pull Request**: No GitHub, vá até o seu fork e clique no botão "Pull Request" para comparar suas alterações com o repositório original e enviar sua contribuição.

### 📍 🗺 Configurando a API do Google Maps 🗺 📍
Para iniciar o projeto na sua máquina local, você precisará adicionar uma chave da API do Google Maps no arquivo `local.properties`. Siga os passos abaixo para obter a chave:

1. Acesse o [Google Cloud Console](https://console.cloud.google.com/).
2. Crie um novo projeto ou selecione um projeto existente.
3. No painel de navegação à esquerda, clique em "Ativar APIs e serviços".
4. Na biblioteca de APIs, pesquise por "Maps SDK for Android" e ative-o para o seu projeto.
5. Após ativar a API, você precisará criar uma chave da API. Para isso, no painel de navegação à esquerda, clique em "Credenciais".
6. Clique em "Criar credenciais" e selecione "Chave de API".
7. Copie a chave gerada.

Agora, adicione a chave da API no arquivo `local.properties`, da seguinte forma:

```properties
MAPS_API_KEY=SUA_CHAVE_DA_API_AQUI
```
*Caso o projeto ainda esteja apresentando erro para iniciar:* 
1. Vá até o arquivo local.properties.
2. Localize a linha que define o diretório do SDK do Android, geralmente parecida com sdk.dir=C\:\\Users\\thiag\\AppData\\Local\\Android\\Sdk3.
3. Remova o 3 do final.
Este procedimento deve corrigir qualquer problema relacionado à inicialização do projeto, deixando dessa maneira: ***sdk.dir=C\:\\Users\\thiag\\AppData\\Local\\Android\\Sdk***

