.class public Lch/qos/logback/classic/ClassicConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_MAX_CALLEDER_DATA_DEPTH:I = 0x8

.field public static final FINALIZE_SESSION:Ljava/lang/String; = "FINALIZE_SESSION"

.field public static final FINALIZE_SESSION_MARKER:LgM2;

.field public static final LOGBACK_CONTEXT_SELECTOR:Ljava/lang/String; = "logback.ContextSelector"

.field public static final MAX_DOTS:I = 0x10


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "FINALIZE_SESSION"

    invoke-static {v0}, LjM2;->b(Ljava/lang/String;)LgM2;

    move-result-object v0

    sput-object v0, Lch/qos/logback/classic/ClassicConstants;->FINALIZE_SESSION_MARKER:LgM2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method