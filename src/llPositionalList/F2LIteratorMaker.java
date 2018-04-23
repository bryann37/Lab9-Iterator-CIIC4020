package llPositionalList;

import java.util.Iterator;

import interfaces.PLIteratorMaker;
import interfaces.Position;
import interfaces.PositionalList;

public class F2LIteratorMaker<E> implements PLIteratorMaker<E> {

	public Iterator<Position<E>> makeIterator(PositionalList<E> pl) {
		// TODO Auto-generated method stub
		return new PLIteratorF2L(pl);
	}


}
