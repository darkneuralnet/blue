.class public LO24;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LO24;

.field public static final c:LO24;

.field public static final d:LO24;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LO24;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, LO24;-><init>(I)V

    sput-object v0, LO24;->b:LO24;

    new-instance v0, LO24;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, LO24;-><init>(I)V

    sput-object v0, LO24;->c:LO24;

    new-instance v0, LO24;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO24;-><init>(I)V

    sput-object v0, LO24;->d:LO24;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LO24;->a:I

    return-void
.end method
