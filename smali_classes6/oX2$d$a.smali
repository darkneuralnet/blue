.class public LoX2$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIZ3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoX2$d;->b()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LIZ3<",
        "LmX2$a<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LoX2$d;


# direct methods
.method public constructor <init>(LoX2$d;)V
    .locals 0

    iput-object p1, p0, LoX2$d$a;->b:LoX2$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LmX2$a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2$a<",
            "TE;>;)Z"
        }
    .end annotation

    iget-object v0, p0, LoX2$d$a;->b:LoX2$d;

    iget-object v0, v0, LoX2$d;->e:LIZ3;

    invoke-interface {p1}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LIZ3;->apply(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LmX2$a;

    invoke-virtual {p0, p1}, LoX2$d$a;->a(LmX2$a;)Z

    move-result p1

    return p1
.end method
