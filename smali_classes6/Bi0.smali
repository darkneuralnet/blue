.class public LBi0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzi0;

.field public final b:[[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lzi0;[[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBi0;->a:Lzi0;

    iput-object p2, p0, LBi0;->b:[[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 6

    iget-object v0, p0, LBi0;->b:[[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-object v5, p0, LBi0;->a:Lzi0;

    invoke-virtual {v5, v4}, Lzi0;->a([Ljava/lang/String;)Z

    move-result v4

    and-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method
