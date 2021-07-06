public class MonoMachine <T>{
    public T executeMonomo(Monomo<T> monomo, T k){
       return monomo.wat(k);

    }

    public T executeBinoni(Binoni<T> binoni, T k, T j){
        return binoni.compare(k, j);
    }

}
