.class public abstract Ljj1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Ljj1;


# direct methods
.method public constructor <init>(Ljj1;)V
    .locals 0

    iput-object p1, p0, Ljj1$a;->a:Ljj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;Z)Z"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Object;)LSh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCONTENT;)",
            "LSh;"
        }
    .end annotation
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ljj1;->e:Ljava/lang/Object;

    return-object v0
.end method
