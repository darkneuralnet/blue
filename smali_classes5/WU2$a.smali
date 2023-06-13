.class public LWU2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWU2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lak2;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lak2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LIS0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LIS0<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lak2;LIS0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "LIS0<",
            "TData;>;)V"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, LWU2$a;-><init>(Lak2;Ljava/util/List;LIS0;)V

    return-void
.end method

.method public constructor <init>(Lak2;Ljava/util/List;LIS0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "Ljava/util/List<",
            "Lak2;",
            ">;",
            "LIS0<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lak2;

    iput-object p1, p0, LWU2$a;->a:Lak2;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LWU2$a;->b:Ljava/util/List;

    invoke-static {p3}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIS0;

    iput-object p1, p0, LWU2$a;->c:LIS0;

    return-void
.end method
