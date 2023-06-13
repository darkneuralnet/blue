.class public LaM2$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LaM2$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaM2;->b(LwA1;)LaM2$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LaM2$i<",
        "TK;TV1;TV2;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LwA1;


# direct methods
.method public constructor <init>(LwA1;)V
    .locals 0

    iput-object p1, p0, LaM2$e;->a:LwA1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV1;)TV2;"
        }
    .end annotation

    iget-object p1, p0, LaM2$e;->a:LwA1;

    invoke-interface {p1, p2}, LwA1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
