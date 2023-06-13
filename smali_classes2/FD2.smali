.class public final synthetic LFD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD2$b;


# instance fields
.field public final synthetic a:LRD2;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LRD2;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFD2;->a:LRD2;

    iput p2, p0, LFD2;->b:I

    iput p3, p0, LFD2;->c:I

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 3

    iget-object v0, p0, LFD2;->a:LRD2;

    iget v1, p0, LFD2;->b:I

    iget v2, p0, LFD2;->c:I

    invoke-static {v0, v1, v2, p1}, LRD2;->h(LRD2;IILrD2;)V

    return-void
.end method
