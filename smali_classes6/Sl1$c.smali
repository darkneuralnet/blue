.class public final LSl1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIZ3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSl1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LIZ3<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final synthetic c:LSl1;


# direct methods
.method public constructor <init>(LSl1;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    iput-object p1, p0, LSl1$c;->c:LSl1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LSl1$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    iget-object v0, p0, LSl1$c;->c:LSl1;

    iget-object v1, p0, LSl1$c;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, LSl1;->p(LSl1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
