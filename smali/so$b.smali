.class public final Lso$b;
.super Lt12;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lso;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt12<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lso;


# direct methods
.method public constructor <init>(Lso;)V
    .locals 0

    iput-object p1, p0, Lso$b;->e:Lso;

    iget p1, p1, LNA5;->d:I

    invoke-direct {p0, p1}, Lt12;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget-object v0, p0, Lso$b;->e:Lso;

    invoke-virtual {v0, p1}, LNA5;->i(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lso$b;->e:Lso;

    invoke-virtual {v0, p1}, LNA5;->k(I)Ljava/lang/Object;

    return-void
.end method
