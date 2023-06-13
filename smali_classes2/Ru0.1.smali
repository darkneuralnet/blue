.class public final synthetic LRu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/WebView$FindListener;


# instance fields
.field public final synthetic a:Lav0;


# direct methods
.method public synthetic constructor <init>(Lav0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRu0;->a:Lav0;

    return-void
.end method


# virtual methods
.method public final onFindResultReceived(IIZ)V
    .locals 1

    iget-object v0, p0, LRu0;->a:Lav0;

    invoke-static {v0, p1, p2, p3}, Lav0;->g(Lav0;IIZ)V

    return-void
.end method
