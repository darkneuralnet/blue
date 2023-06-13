.class public final synthetic Lzm8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYm9;


# instance fields
.field public final synthetic a:LBA8;

.field public final synthetic b:J

.field public final synthetic c:LG59;

.field public final synthetic d:LJQ7;

.field public final synthetic e:LJQ7;

.field public final synthetic f:Lg32;


# direct methods
.method public synthetic constructor <init>(LBA8;JLG59;LJQ7;LJQ7;Lg32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzm8;->a:LBA8;

    iput-wide p2, p0, Lzm8;->b:J

    iput-object p4, p0, Lzm8;->c:LG59;

    iput-object p5, p0, Lzm8;->d:LJQ7;

    iput-object p6, p0, Lzm8;->e:LJQ7;

    iput-object p7, p0, Lzm8;->f:Lg32;

    return-void
.end method


# virtual methods
.method public final zza()LRl9;
    .locals 7

    iget-object v0, p0, Lzm8;->a:LBA8;

    iget-wide v1, p0, Lzm8;->b:J

    iget-object v3, p0, Lzm8;->c:LG59;

    iget-object v4, p0, Lzm8;->d:LJQ7;

    iget-object v5, p0, Lzm8;->e:LJQ7;

    iget-object v6, p0, Lzm8;->f:Lg32;

    invoke-virtual/range {v0 .. v6}, LBA8;->j(JLG59;LJQ7;LJQ7;Lg32;)LRl9;

    move-result-object v0

    return-object v0
.end method
