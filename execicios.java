private int  conta_folha(No p){
    if (p == null)
        return;
    if(p.esq == null && p.dir == null){
        return 1;
    }
    return conta_folha(p.esq) + conta_folha(p.dir)
}

private int  conta_internos(No p){
    if (p == null)
        return;
    if(p.esq == null && p.dir == null){
        return 0;
    }
    if(p != raiz)
        return conta_folha(p.esq) + conta_folha(p.dir) +1;
    
    return conta_folha(p.esq) + conta_folha(p.dir)
}

private Arvore clone_arvore(No p){
    
}