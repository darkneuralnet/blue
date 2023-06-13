.class public final synthetic LBm8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li49;


# instance fields
.field public final synthetic a:LAt8;

.field public final synthetic b:J

.field public final synthetic c:LZN8;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Lg32;


# direct methods
.method public synthetic constructor <init>(LAt8;JLZN8;IILg32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBm8;->a:LAt8;

    iput-wide p2, p0, LBm8;->b:J

    iput-object p4, p0, LBm8;->c:LZN8;

    iput p5, p0, LBm8;->d:I

    iput p6, p0, LBm8;->e:I

    iput-object p7, p0, LBm8;->f:Lg32;

    return-void
.end method


# virtual methods
.method public final zza()Lz59;
    .locals 7

    iget-object v0, p0, LBm8;->a:LAt8;

    iget-wide v1, p0, LBm8;->b:J

    iget-object v3, p0, LBm8;->c:LZN8;

    iget v4, p0, LBm8;->d:I

    iget v5, p0, LBm8;->e:I

    iget-object v6, p0, LBm8;->f:Lg32;

    invoke-virtual/range {v0 .. v6}, LAt8;->l(JLZN8;IILg32;)Lz59;

    move-result-object v0

    return-object v0
.end method
