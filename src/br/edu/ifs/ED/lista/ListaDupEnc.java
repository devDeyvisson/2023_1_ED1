package br.edu.ifs.ED.lista;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T>{
    @Override
    public void incluir(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if (posicao < 0 || posicao > tamanho) {
            throw new Exception("Posição inválida");
        }
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        if (posicao == 0) {
            if (inicio != null) {
                novoNo.prox = Inicio;
                inicio.ant = novoNo;
            }
            Inicio = novoNo;
        } else {
            NoDuplo<T> atual = Inicio;
            int contador = 0;
        }
        while (contador < posicao - 1 && atual != null){
            atual = atual.prox;
            contador++;
         }
         if (atual != null) {
            novoNo.prox = atual.prox;
            if (atual.prox != null) {
                atual.prox.ant = novoNo;
            }
        novoNo.ant = atual;
        atual.prox = novoNo;
        } else {
            throw new Exception("Posição inválida");
        }
        }
        tamanho++;
         }

    }

    @Override
    public T get(int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return Integer.MIN_VALUE;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }
    public abstract Lista<T> subLista(int posInicial, int posFinal)
			throws Exception {
			 if (posInicial < 0 || posInicial >= tamanho || posFinal < 0 ||
			posFinal >= tamanho || posInicial > posFinal) {
				 throw new Exception("Posições inválidas.");
			 }
			 Lista<T> subLista = new Lista<>();
			 NoDuplo<T> atual = inicio;
			 int cont = 0;
			 while (cont < posInicial && atual != null) {
				 atual = atual.prox;
				 cont++;
			 }
			 while (cont <= posFinal && atual != null) {
				 subLista.incluirFim(atual.dado);
				 atual = atual.prox;
				 cont++;
			 }
			 return subLista;
			}
}
