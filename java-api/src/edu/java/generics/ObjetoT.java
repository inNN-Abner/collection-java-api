package edu.java.generics;

/*public class ObjetoT {
    //Transformando Object em um TIPO GENÉRICO
    //Uma CLASSE GENÉRICA é uma parametrização em relação a tipos;
    private Object object;

    public void set(Object object){
        this.object = object;
    }
    public Object get(){
        return object;
    }*/

    //O símbolo '<>' é chamado de "Diamond Operator" - Ele infere automaticamente o tipo com base no contexto
    public class ObjetoT<T>{
        // 'T' representa Type|Tipo
        private T t;

        public void set (T t){
            this.t = t;
        }
        public T get(){
            return t;
        }

    }
/* Uma variável de <tipo> pode ser qualquer tipo NÃO PRIMITIVO que você especificar:
 *  Qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou qualquer tipo de variável;
 * 
 * Essa mesma técnica pode ser aplicada para criar interfaces genéricas
 * Os nomes de parâmetro de tipos mais comuns são:
 *  - E - Element - Elemento
 *  - K - Key - Chave
 *  - N - Number - Número
 *  - T - Type - Tipo
 *  - V - Value - Valor
 *  - S | U | V | etc | - 2°,3°,4° tipos
 */
