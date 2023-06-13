.class public final LN69;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly69;

.field public final b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lq69;LF69;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq69;->c(Lq69;)Ly69;

    move-result-object p2

    iput-object p2, p0, LN69;->a:Ly69;

    invoke-static {p1}, Lq69;->e(Lq69;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LN69;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Ly69;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LN69;->a:Ly69;

    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LN69;->b:Ljava/lang/Integer;

    return-object v0
.end method
