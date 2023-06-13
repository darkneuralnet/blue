.class public Lkw6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGB0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkw6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final b:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:Lkw6;


# direct methods
.method public constructor <init>(Lkw6;Ljava/util/EnumSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkw6$b;->d:Lkw6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LAy3;->b:LAy3;

    sget-object v0, LAy3;->c:LAy3;

    invoke-static {p1, v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    iput-object p2, p0, Lkw6$b;->b:Ljava/util/EnumSet;

    return-void
.end method

.method public synthetic constructor <init>(Lkw6;Ljava/util/EnumSet;Lkw6$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lkw6$b;-><init>(Lkw6;Ljava/util/EnumSet;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/EnumSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    return-object v0
.end method

.method public d(LEB0;I)V
    .locals 4

    iget-object v0, p0, Lkw6$b;->b:Ljava/util/EnumSet;

    sget-object v1, LAy3;->d:LAy3;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LEB0;->W0(I)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lkw6$b;->b:Ljava/util/EnumSet;

    sget-object v1, LAy3;->e:LAy3;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, LEB0;->v3(I)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 2

    iget-object v0, p0, Lkw6$b;->c:Ljava/util/EnumSet;

    iget-object v1, p0, Lkw6$b;->b:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
