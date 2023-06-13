.class public LC83$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI96;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC83;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LI96<",
        "TR;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZS0;Z)LG96;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZS0;",
            "Z)",
            "LG96<",
            "TR;>;"
        }
    .end annotation

    sget-object p1, LC83;->a:LC83;

    return-object p1
.end method
