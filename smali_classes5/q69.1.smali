.class public final Lq69;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ly69;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic c(Lq69;)Ly69;
    .locals 0

    iget-object p0, p0, Lq69;->a:Ly69;

    return-object p0
.end method

.method public static bridge synthetic e(Lq69;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lq69;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Lq69;
    .locals 0

    iput-object p1, p0, Lq69;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(Ly69;)Lq69;
    .locals 0

    iput-object p1, p0, Lq69;->a:Ly69;

    return-object p0
.end method

.method public final d()LN69;
    .locals 2

    new-instance v0, LN69;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LN69;-><init>(Lq69;LF69;)V

    return-object v0
.end method
