.class public LZa2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls00;
.implements Ljava/io/Serializable;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZa2;->b:Ljava/lang/Object;

    iput-object p2, p0, LZa2;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZa2;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public getBounds()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZa2;->b:Ljava/lang/Object;

    return-object v0
.end method
