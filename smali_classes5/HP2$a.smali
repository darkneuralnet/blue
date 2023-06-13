.class public LHP2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHP2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LXU2<",
        "Landroid/net/Uri;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHP2$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public b(LQW2;)LWU2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "Landroid/net/Uri;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, LHP2;

    iget-object v0, p0, LHP2$a;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, LHP2;-><init>(Landroid/content/Context;)V

    return-object p1
.end method
