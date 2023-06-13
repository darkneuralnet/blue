.class public final synthetic Lv99;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgm9;


# instance fields
.field public final synthetic a:Lz26;

.field public final synthetic b:J

.field public final synthetic c:LV39;

.field public final synthetic d:Lg32;


# direct methods
.method public synthetic constructor <init>(Lz26;JLV39;Lg32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv99;->a:Lz26;

    iput-wide p2, p0, Lv99;->b:J

    iput-object p4, p0, Lv99;->c:LV39;

    iput-object p5, p0, Lv99;->d:Lg32;

    return-void
.end method


# virtual methods
.method public final zza()Lxk9;
    .locals 5

    iget-object v0, p0, Lv99;->a:Lz26;

    iget-wide v1, p0, Lv99;->b:J

    iget-object v3, p0, Lv99;->c:LV39;

    iget-object v4, p0, Lv99;->d:Lg32;

    invoke-virtual {v0, v1, v2, v3, v4}, Lz26;->j(JLV39;Lg32;)Lxk9;

    move-result-object v0

    return-object v0
.end method
