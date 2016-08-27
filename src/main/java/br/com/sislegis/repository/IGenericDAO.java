package br.com.sislegis.repository;

import java.io.Serializable;
import java.util.List;

public interface IGenericDAO<T> 
{
	void salvar(T objeto);

    void atualizar(T objeto);

    void excluir (T objeto);

    T buscar(Serializable id);

    List<T> listar();
}
