.class public final synthetic Lym1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX94;


# instance fields
.field public final synthetic a:LAm1;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(LAm1;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym1;->a:LAm1;

    iput-object p2, p0, Lym1;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lym1;->a:LAm1;

    iget-object v1, p0, Lym1;->b:Landroid/content/Context;

    invoke-static {v0, v1}, LAm1;->b(LAm1;Landroid/content/Context;)LFS0;

    move-result-object v0

    return-object v0
.end method
