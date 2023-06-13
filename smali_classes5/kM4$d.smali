.class public LkM4$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LkM4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LXU2<",
        "Ljava/lang/Integer;",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkM4$d;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public b(LQW2;)LWU2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "Ljava/lang/Integer;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    new-instance p1, LkM4;

    iget-object v0, p0, LkM4$d;->a:Landroid/content/res/Resources;

    invoke-static {}, Lde6;->c()Lde6;

    move-result-object v1

    invoke-direct {p1, v0, v1}, LkM4;-><init>(Landroid/content/res/Resources;LWU2;)V

    return-object p1
.end method
