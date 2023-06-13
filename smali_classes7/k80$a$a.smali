.class public final Lk80$a$a;
.super Lbe3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk80$a;->a(Ljava/util/Locale;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbe3<",
        "Ljava/lang/String;",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u0014\u0010\u0008\u001a\u0010\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0014J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\u0004H\u0014\u00a8\u0006\r"
    }
    d2 = {
        "k80$a$a",
        "Lbe3;",
        "key",
        "value",
        "",
        "b",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "",
        "from",
        "c",
        "d",
        "(Ljava/lang/Object;)V",
        "a",
        "restring_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic e:Ljava/util/Map;

.field public final synthetic f:Ljava/util/Locale;

.field public final synthetic g:Ljava/util/Map;

.field public final synthetic h:Ljava/util/Locale;

.field public final synthetic i:Ljava/util/Map;

.field public final synthetic j:Ljava/util/Locale;

.field public final synthetic k:Ljava/util/Map;

.field public final synthetic l:Ljava/util/Locale;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/Locale;Ljava/util/Map;Ljava/util/Locale;Ljava/util/Map;Ljava/util/Locale;Ljava/util/Map;Ljava/util/Locale;)V
    .locals 0

    iput-object p3, p0, Lk80$a$a;->e:Ljava/util/Map;

    iput-object p4, p0, Lk80$a$a;->f:Ljava/util/Locale;

    iput-object p5, p0, Lk80$a$a;->g:Ljava/util/Map;

    iput-object p6, p0, Lk80$a$a;->h:Ljava/util/Locale;

    iput-object p7, p0, Lk80$a$a;->i:Ljava/util/Map;

    iput-object p8, p0, Lk80$a$a;->j:Ljava/util/Locale;

    iput-object p9, p0, Lk80$a$a;->k:Ljava/util/Map;

    iput-object p10, p0, Lk80$a$a;->l:Ljava/util/Locale;

    invoke-direct {p0, p1, p2}, Lbe3;-><init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lk80$a$a;->k:Ljava/util/Map;

    iget-object v1, p0, Lk80$a$a;->l:Ljava/util/Locale;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lk80$a$a;->e:Ljava/util/Map;

    iget-object v1, p0, Lk80$a$a;->f:Ljava/util/Locale;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+",
            "Ljava/lang/String;",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk80$a$a;->g:Ljava/util/Map;

    iget-object v1, p0, Lk80$a$a;->h:Ljava/util/Locale;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lk80$a$a;->i:Ljava/util/Map;

    iget-object v1, p0, Lk80$a$a;->j:Ljava/util/Locale;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
