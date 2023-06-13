.class public LEf6$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;
.implements LEf6$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEf6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LXU2<",
        "Landroid/net/Uri;",
        "Ljava/io/InputStream;",
        ">;",
        "LEf6$c<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEf6$d;->a:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)LIS0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "LIS0<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, LwR5;

    iget-object v1, p0, LEf6$d;->a:Landroid/content/ContentResolver;

    invoke-direct {v0, v1, p1}, LwR5;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    return-object v0
.end method

.method public b(LQW2;)LWU2;
    .locals 0
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

    new-instance p1, LEf6;

    invoke-direct {p1, p0}, LEf6;-><init>(LEf6$c;)V

    return-object p1
.end method
