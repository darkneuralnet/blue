.class public final LVN7;
.super LmV7;
.source "SourceFile"


# instance fields
.field public final synthetic c:LxO7;


# direct methods
.method public constructor <init>(LxO7;Ljava/util/ListIterator;)V
    .locals 0

    iput-object p1, p0, LVN7;->c:LxO7;

    invoke-direct {p0, p2}, LmV7;-><init>(Ljava/util/ListIterator;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVN7;->c:LxO7;

    iget-object v0, v0, LxO7;->c:Lhs9;

    invoke-interface {v0, p1}, Lhs9;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
