package llPositionalList;

import java.util.Iterator;

import interfaces.PLIteratorMaker;
import interfaces.Position;
import interfaces.PositionalList;

public class PositionalIteratorMaker<E> implements PLIteratorMaker<E>{

	@Override
	public Iterator<Position<E>> makeIterator(PositionalList<E> pl) {
		// TODO Auto-generated method stub
		return (Iterator<Position<E>>) ((LinkedPositionalList<E>)pl).new BackwardElementIterator();
	}

}