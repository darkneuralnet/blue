.class public final LWR8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZN8;


# direct methods
.method public synthetic constructor <init>(LAR8;LLR8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LAR8;->a(LAR8;)LZN8;

    move-result-object p1

    iput-object p1, p0, LWR8;->a:LZN8;

    return-void
.end method


# virtual methods
.method public final a()LZN8;
    .locals 1
    .annotation build LmW7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LWR8;->a:LZN8;

    return-object v0
.end method
