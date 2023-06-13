.class public final LJk0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lq46;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsx2;",
            ">;"
        }
    .end annotation
.end field

.field public c:LSC1;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LJk0$a;->a:Lq46;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LJk0$a;->b:Ljava/util/List;

    iput-object v0, p0, LJk0$a;->c:LSC1;

    const-string v0, ""

    iput-object v0, p0, LJk0$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lsx2;)LJk0$a;
    .locals 1

    iget-object v0, p0, LJk0$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()LJk0;
    .locals 5

    new-instance v0, LJk0;

    iget-object v1, p0, LJk0$a;->a:Lq46;

    iget-object v2, p0, LJk0$a;->b:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, LJk0$a;->c:LSC1;

    iget-object v4, p0, LJk0$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, LJk0;-><init>(Lq46;Ljava/util/List;LSC1;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)LJk0$a;
    .locals 0

    iput-object p1, p0, LJk0$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(LSC1;)LJk0$a;
    .locals 0

    iput-object p1, p0, LJk0$a;->c:LSC1;

    return-object p0
.end method

.method public e(Lq46;)LJk0$a;
    .locals 0

    iput-object p1, p0, LJk0$a;->a:Lq46;

    return-object p0
.end method
