.class public LJy5$b;
.super LJy5$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJy5$c;-><init>(LJy5$a;)V

    return-void
.end method

.method public synthetic constructor <init>(LJy5$a;)V
    .locals 0

    invoke-direct {p0}, LJy5$b;-><init>()V

    return-void
.end method


# virtual methods
.method public o(Lcom/facebook/share/model/ShareStoryContent;)V
    .locals 0

    invoke-static {p1, p0}, LJy5;->l(Lcom/facebook/share/model/ShareStoryContent;LJy5$c;)V

    return-void
.end method
