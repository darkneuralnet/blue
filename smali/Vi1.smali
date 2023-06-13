.class public LVi1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LWi1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LWi1;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, LWi1;

    iput-object v0, p0, LVi1;->a:LWi1;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "LCV5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LVi1;->a:LWi1;

    if-nez v0, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, LWi1;->g(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
