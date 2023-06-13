.class public final Lhe6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr96;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr96<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:Lr96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr96<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe6;

    invoke-direct {v0}, Lhe6;-><init>()V

    sput-object v0, Lhe6;->b:Lr96;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lhe6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lhe6<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lhe6;->b:Lr96;

    check-cast v0, Lhe6;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/content/Context;LVL4;II)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LVL4<",
            "TT;>;II)",
            "LVL4<",
            "TT;>;"
        }
    .end annotation

    return-object p2
.end method
