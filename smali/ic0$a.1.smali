.class public final Lic0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "LGb0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lic0$a;->a:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public constructor <init>(Ljava/util/LinkedHashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "LGb0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lic0$a;->a:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public static c(Lic0;)Lic0$a;
    .locals 1

    new-instance v0, Lic0$a;

    invoke-virtual {p0}, Lic0;->c()Ljava/util/LinkedHashSet;

    move-result-object p0

    invoke-direct {v0, p0}, Lic0$a;-><init>(Ljava/util/LinkedHashSet;)V

    return-object v0
.end method


# virtual methods
.method public a(LGb0;)Lic0$a;
    .locals 1

    iget-object v0, p0, Lic0$a;->a:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lic0;
    .locals 2

    new-instance v0, Lic0;

    iget-object v1, p0, Lic0$a;->a:Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1}, Lic0;-><init>(Ljava/util/LinkedHashSet;)V

    return-object v0
.end method

.method public d(I)Lic0$a;
    .locals 2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The specified lens facing is invalid."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lic0$a;->a:Ljava/util/LinkedHashSet;

    new-instance v1, Llq2;

    invoke-direct {v1, p1}, Llq2;-><init>(I)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
