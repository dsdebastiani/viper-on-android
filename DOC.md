# VIPER - Arquitetura limpa para apps Android

## Arquitetura de Software

O processo de arquitetura de software considera os requisitos do cliente, os analisa e produz um projeto de componente de software que atenderá às necessidades dele. Os projetos de software bem-sucedidos devem equilibrar as compensações inevitáveis que surgem devido a requisitos conflitantes, estar em conformidade com os princípios de design e técnicas de prática recomendada que se desenvolveram com o tempo e complementar os modernos sistemas de hardware, rede e gerenciamento. Uma arquitetura de software sólida envolve uma considerável experiência teórica e prática, bem como a visão necessária para transformar o que pode parecer requisitos e cenários comerciais vagos em projetos de trabalho sólidos e práticos.

A arquitetura de software envolve definir uma solução estruturada que atenda a todos os requisitos técnicos e operacionais e que, ao mesmo tempo, otimize atributos de qualidade comuns, como desempenho, segurança e capacidade de gerenciamento. Ela implica uma série de decisões baseadas em inúmeros fatores, e cada uma dessas decisões pode ter impacto considerável sobre a qualidade, o desempenho, a facilidade de manutenção e o sucesso geral do software.

O software moderno raramente é autônomo. No mínimo, na maioria dos casos, ele irá interagir com uma fonte de dados, como um banco de dados corporativo, que expõe informações com as quais os usuários do software trabalham. Normalmente o software moderno também deve interagir com outros serviços e funções de rede para executar autenticação, obter e publicar informações e propiciar uma experiência integrada para o usuário. Sem uma arquitetura adequada, pode ser difícil ou até mesmo impossível implantar, operar, manter e integrar o software a outros sistemas corretamente, além de não atender às necessidades do usuário.

A arquitetura de software pode ser considerada como um mapeamento entre o que um componente de software deve realizar e os detalhes da implementação como código. Desenvolver a arquitetura certa assegurará a combinação ideal entre requisitos e resultados. Um software bem-arquitetado executará as tarefas especificadas seguindo os parâmetros dos requisitos originais e fará isso de um modo que maximize o desempenho, a segurança, a confiabilidade e muitos outros fatores.

No nível mais alto, o projeto de arquitetura deve expor a estrutura do sistema e ocultar os detalhes da implementação, realizar todos os casos de uso e cenários, tentar considerar os requisitos de todas as partes interessadas e atender o máximo possível a todos os requisitos funcionais e de qualidade.

Em An Introduction to Software Architecture, David Garlan e Mary Shaw sugerem que a arquitetura de software é um nível de design voltado para questões que vão: "além dos algoritmos e das estruturas de dados da computação. A projeção e a especificação da estrutura geral do sistema emergem como um novo tipo de problema. As questões estruturais incluem organização total e estrutura de controle global; protocolos de comunicação, sincronização e acesso a dados; atribuição de funcionalidade a elementos de design; distribuição física; composição de elementos de design; escalonamento e desempenho; e seleção entre as alternativas de design." [GAR93]

Há mais a arquiteturar do que apenas a estruturar. O artigo Working Group on Architecture da IEEE define a arquitetura como "o conceito de nível mais alto de um sistema em seu ambiente" [IEEE98]. Ele também abrange a "adequação" à integridade do sistema, às restrições econômicas, às preocupações estéticas e ao estilo. Ele não se limita a um enfoque interno, mas leva em consideração o sistema como um todo em seu ambiente de usuário e de desenvolvimento, ou seja, um enfoque externo.

No RUP, a arquitetura de um sistema de software (em um determinado ponto) é a organização ou a estrutura dos componentes significativos do sistema que interagem por meio de interfaces, com elementos constituídos de componentes e interfaces sucessivamente menores.

### Visões de Arquitetura de Sofware

Existem vários padrões e estilos de arquitetura de software. Os mais conhecidos são:

1. Cliente Servidor (Client-server)
2. Centrado em dados (Data-centric)
3. Guiada a eventos (Event-driven)
4. Em camadas (Layered)
5. Microserviços (Microservices)
6. Monotlítica (Monolithic)
7. Orientada a serviços (Service-oriented - SOA)

Alguns dos padõres e estilos arquiteturais são semelhantes, ou até, o mesmo. Outros, são apenas especializações de um padrão. Mas o que todos eles tem em comum é que eles são um idioma que arquitetos utilizam para prover uma linguagem comum ou vocabulário para descrever classes de sistemas.

### Padrão de Arquitetura de Software em Camadas - Layered

Diz-se que uma boa arquitetura de software permite a criação de um projeto com partes independentes, ou com pelo menos um baixo acoplamento, resultando assim em softwares de fácil manutenção. Além disso uma boa arquitetura busca oferecer uma alta coesão ao software, conceito ligado ao Princípio de Responsabilidade Única (SRP) do SOLID. A alta coesão existe quando cada componente possui apenas uma responsabilidade e realiza em suas funções somente aquile que realmente deve fazer.

Qaunto mais fraco for o acomplamenteo e mais alta a coesão, melor é a estrutura do software. Uma solução encontrada para diminuir o acomplamento e aumentar a coesão em um software foi dividí-lo em camadas. Normalmente encontramos a seguinte divisão em uma aplicação com interface gráfica para usuário:

1. Camada de Interface de Usuário - (UI layer)
2. Camada de Aplicação - (Application/Service layer)
3. Camada de Dmoníio - (Business logic/Domain layer)
4. Camada de Acesso a Dados - (Data access/Persistence layer)

### Conceito SOLID

### Arquitetura Limpa

## Arquitetura de Software no Android

## VIPER

## VIPER no Android

## Referências

- [Software architecture](https://en.wikipedia.org/wiki/Software_architecture)
- [Visão geral da arquitetura](https://msdn.microsoft.com/pt-br/hh144976.aspx)
- [Conceitos:  Arquitetura de Software](http://www.funpar.ufpr.br:8080/rup/process/workflow/ana_desi/co_swarch.htm)
- [10 Common Software Architectural Patterns in a nutshell](https://towardsdatascience.com/10-common-software-architectural-patterns-in-a-nutshell-a0b47a1e9013)
- [A Arquitetura Limpa (Clean Architecture)](https://medium.com/@mycaellmoura/a-arquitetura-limpa-clean-architecture-7902846bffa8)