.class public final LrF0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LrF0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Integer;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LrF0;
    .locals 5

    new-instance v0, LrF0;

    iget-object v1, p0, LrF0$a;->a:Ljava/lang/Integer;

    iget-object v2, p0, LrF0$a;->b:Ljava/lang/Integer;

    iget-object v3, p0, LrF0$a;->c:Ljava/lang/Integer;

    iget-object v4, p0, LrF0$a;->d:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3, v4}, LrF0;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public b(I)LrF0$a;
    .locals 1

    const/high16 v0, -0x1000000

    or-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LrF0$a;->a:Ljava/lang/Integer;

    return-object p0
.end method
