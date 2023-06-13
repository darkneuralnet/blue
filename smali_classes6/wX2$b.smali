.class public LwX2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyV2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LwX2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LwX2$a;)V
    .locals 0

    invoke-direct {p0}, LwX2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LzV2;Ljava/lang/String;Ljava/lang/String;)LyV2$a;
    .locals 0

    sget-object p1, LAV2;->a:LyV2$a;

    return-object p1
.end method
