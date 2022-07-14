#language:pt
#Author: brianoliveira228@hotmail.com
@Regressivos
Funcionalidade: Buscar Produto
  Eu como usuario quero ter facilidade para encontrar produtos atraves do campo pesquisar

  Fundo: Acessar o site
    Dado que eu acesso o site "https://www.drogariaspacheco.com.br/"

  Cenario: Validar pesquisa de remedio por nome
    E que eu clique no campo de busca
    E digite "Benegrip"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Benegrip"
    E valido texto "Resultado De Busca: Benegrip"
    E tiro print "Pesquisa de remédio por nome"
    Entao fecho navegador

  Cenario: Validar apenas busca de genericos
    E que eu clique no campo de busca
    E digite "Genéricos"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Gen%C3%A9ricos"
    E valido texto "Resultado De Busca: Genéricos"
    E tiro print "Busca de genéricos"
    Entao fecho navegador

  Cenario: Validar busca por fabricante
    E que eu clique no campo de busca
    E digite "Colgate"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Colgate"
    E valido texto "Resultado De Busca: Colgate"
    E tiro print "Busca por fabricante"
    Entao fecho navegador

  Cenario: Validar pesquisa de fralda
    E que eu clique no campo de busca
    E digite "Fralda"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Fralda"
    E valido texto "Resultado De Busca: Fralda"
    E tiro print "Pesquisa de fralda"
    Entao fecho navegador

  Cenario: Validar pesquisa de Vitamina C
    E que eu clique no campo de busca
    E digite "Vitamina C"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Vitamina%20C"
    E valido texto "Resultado De Busca: Vitamina C"
    E tiro print "Pesquisa de Vitamina C"
    Entao fecho navegador

  Cenario: Validar pesquisa de Soro Fisiologico
    E que eu clique no campo de busca
    E digite "Soro Fisiológico"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Soro%20Fisiol%C3%B3gico"
    E valido texto "Resultado De Busca: Soro Fisiológico"
    E tiro print "Pesquisa de Soro Fisiológico"
    Entao fecho navegador

  Cenario: Validar pesquisa de Sabonete Liquido
    E que eu clique no campo de busca
    E digite "Sabonete líquido"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Sabonete%20l%C3%ADquido"
    E valido texto "Resultado De Busca: Sabonete Líquido"
    E tiro print "Pesquisa de Sabonete Líquido"
    Entao fecho navegador

  Cenario: Validar pesquisa nao encontrada
    E que eu clique no campo de busca
    E digite "Xbox"
    Quando clicar em pesquisar
    Entao valido a url "https://www.drogariaspacheco.com.br/pesquisa?q=Xbox"
    E valido texto "Nenhum Resultado Encontrado!"
    E tiro print "Pesquisa Não Encontrada"
    Entao fecho navegador
