.class public final synthetic Leo7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lip7;


# instance fields
.field public final synthetic a:Lfo7;

.field public final synthetic b:Ldo7;

.field public final synthetic c:Ljo7;


# direct methods
.method public synthetic constructor <init>(Lfo7;Ldo7;Ljo7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leo7;->a:Lfo7;

    iput-object p2, p0, Leo7;->b:Ldo7;

    iput-object p3, p0, Leo7;->c:Ljo7;

    return-void
.end method


# virtual methods
.method public final zzb()Z
    .locals 3

    iget-object v0, p0, Leo7;->a:Lfo7;

    iget-object v1, p0, Leo7;->b:Ldo7;

    iget-object v2, p0, Leo7;->c:Ljo7;

    invoke-virtual {v0, v1, v2}, Lfo7;->b(Ldo7;Ljo7;)Z

    move-result v0

    return v0
.end method
