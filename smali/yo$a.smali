.class public Lyo$a;
.super Lt12;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt12<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lyo;


# direct methods
.method public constructor <init>(Lyo;)V
    .locals 0

    iput-object p1, p0, Lyo$a;->e:Lyo;

    iget p1, p1, Lyo;->d:I

    invoke-direct {p0, p1}, Lt12;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lyo$a;->e:Lyo;

    invoke-virtual {v0, p1}, Lyo;->s(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lyo$a;->e:Lyo;

    invoke-virtual {v0, p1}, Lyo;->o(I)Ljava/lang/Object;

    return-void
.end method
